% alumno(matricula, nombre, fechaN, curp, correo, telef, edad, especialidad, tutor, categoria).
:- dynamic(alumno/2).
alumno(hv333, [jose, junio1893, zasbt, beast@, ext123, veinte, actor, maria, grado]).

% maestro(matricula, nombre, fechaN, curp, correo, telef, edad, gradoA, antig, materia).
:- dynamic(maestro/2).
maestro(hs321, [andres, agosto1284, asdf, corp@, ext3456, treinta, profesor, doceanhios, actuacion]).

%mostramos todos los alumnos y maestros
listar :- setof(X, (P,H)^(alumno(P,H), member(X,H)), L), write(L),nl,
          setof(Y, (Q,R)^(maestro(Q,R), member(Y,R)), M), write(M),nl..

%agregamos un alumno a la base de datos
adicionarA :- write('Matricula '), read(Matricula),
              write('Escriba 9 por favor '),
              read(Cant), crearAlum(Cant, A),
              Alum = alumno(Matricula,A),
              asserta(Alum).
 crearAlum(0,[])          :- !,true.  
crearAlum(C, [DATO|L]). :- read(DATO), Ctemp is C - 1, crearAlum(Ctemp,L).

%agregamos un maestro a la base de datos
adicionarM :- write('Matricula '), read(Matricula),
              write('Escriba 9 por favor '),
              read(Cant), crearMaest(Cant, A),
              Alum = alumno(Matricula,A),
              asserta(Alum).
crearMaest(0,[])          :- !,true.  
crearMaest(C, [DATO|L]). :- read(DATO), Ctemp is C - 1, crearMaest(Ctemp,L).


%eliminamos cualquier registro que coincida
eliminar :- write('Matricula '), read(Matricula).
            retract(alumno(Matricula,_)), !.
eliminar :- write('No existe tal persona \n').


%borramos todos los registros
borrar :- abolish(alumno/2), abolish(maestro/2),
          write('Se han borrado todos los datos /n').

%menu que aparece en consola
menu :- write('******** MENU ESCUELA INBA *******'),nl,
        write('1. AGREGAR ALUMNO.'),nl,
        write('2. AGREGAR MAESTRO.'),nl,
        write('3. ELIMINAR MAESTRO O ALUMNO.'),nl,
        write('4. BORRAR TODOS LOS REGISTROS.'),nl,
        write('5. LISTAR TODOS LOS REGISTROS.'),nl,
        write('*** PRESIONA CERO PARA SALIR *****'),nl,
        write('*** ELIGE UNA OPCION *****'), read(Opcion),
        ejecutar(Opcion).

%dependiendo la opcion se ejecuta el menu
ejecutar(Opcion):- Opcion == 1, adicionarA , menu;
                   Opcion == 2, adicionarM , menu;
                   Opcion == 3, eliminar   , menu;
                   Opcion == 4, borrar     , menu;
                   Opcion == 5, listar     , menu;
                   Opcion == 0, true.

