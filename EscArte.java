/* @(#)EscArte.java 
 * @author Jose Garfia, Oscard Diaz 
 * @version 1.00 2016/4/19
 */

public class EscArte {
        
    public EscArte() {
    }
    
    public static void main(String[] args) {
        // Main
    }
}//escuela de arte

class Persona {
    //atributos
    String Nombre, Matricula, FechaNac, Curp, Correo;
    int    Telefono, Edad;
         
    //constructor
    public Persona(String Nombre, String Matricula, String FechaNac, String Curp,
                   String Correo, int Telefono, int Edad) {
           this.Nombre    = Nombre;
           this.Matricula = Matricula;
           this.FechaNac  = FechaNac;
           this.Curp      = Curp;
           this.Correo    = Correo;
           this.Telefono  = Telefono;
           this.Edad      = Edad;
    }//constructor

//metodos regresar
public String RegNombre(){
	return Nombre;
}

public String RegMatricula(){
	return Matricula;
}

public String RegFechaNac(){
	return FechaNac;
}

public String RegCurp(){
	return Curp;
}
public String RegCorreo(){
	return Correo;
}

public int RegTelefono(){
	return Telefono;
}

public int RegEdad(){
	return Edad;
}

//metodos modificar
public void ModNombre (String n){
	Nombre = n;
}

public void ModMatricula (String m ){
	Matricula = m;
}

public void ModFechaNac (String f){
	FechaNac = f;
}

public void ModCurp (String c){
	Curp = c;
}

public void ModCorreo (String co){
	Correo = co;
}

public void ModTelefono (int t){
	Telefono = t;
}
public void ModEdad(int e){
	Edad = e;
}

}//persona

class Profesor extends Persona {
	//atributos
	String  GradoAcad, Antiguedad, Materia;
	float   Sueldo;
	Boolean Suplente = false;
	
	//constructor
	public Profesor(String Nombre, String Matricula, String FechaNac, String Curp,
                    String Correo, int Telefono, int Edad, String GradoAcad, String Antiguedad,
                    String Materia, float Sueldo, Boolean Suplente){
           super(Nombre, Matricula, FechaNac, Curp, Correo, Telefono, Edad);
           this.GradoAcad  = GradoAcad;
           this.Antiguedad = Antiguedad;
           this.Materia    = Materia;
           this.Suplente   = Suplente;
	}//constructor

//metodos regresar
public String RegGradoAcad(){
	return GradoAcad;
}

public String RegAntiguedad(){
	return Antiguedad;
}

public String RegMateria(){
	return Materia;
}
public float RegSueldo(){
	return Sueldo;
}

public Boolean RegSuplente(){
	return Suplente;
}

//metodos modificar
public void ModGradoAcad (String g){
	GradoAcad = g;
}

public void ModAntiguedad (String a){
	Antiguedad = a;
}

public void ModMateria (String ma){
	Materia = ma;
}

public void ModSueldo (float s){
	Sueldo = s;
}

public void ModSuplente (Boolean su){
	Suplente = su;
}
}//profesor

class Alumno extends Persona {
	//atributos
	String Especialidad, Tutor, Categoria;
	
	//constructor
	public Alumno(String Nombre, String Matricula, String FechaNac, String Curp,
                  String Correo, int Telefono, int Edad, String Especialidad,
                  String Tutor, String Categoria){
           super(Nombre, Matricula, FechaNac, Curp, Correo, Telefono, Edad);
           this.Especialidad = Especialidad;
           this.Tutor = Tutor;
           this.Categoria = Categoria; 
	} //constructor

//metodos regresar
public String RegEspecialidad(){
    return Especialidad;
}

public String Regtutor(){
    return Tutor;
}

public String RegCategoria(){
    return Categoria;
}

//metodos modificar
public void ModEspecialidad(String es){
	Especialidad = es;
}

public void ModTutor(String tu){
	Tutor = tu;
}

public void ModCategoria(String ca){
	Categoria = ca;
}
}//Alumno

class Curso{
	//atributos
	String CicloCurso, MateriaCurso, profesorCurso, alumnoCurso, Clave;
	int    id_Curso;
	//constructor
	public Curso(String CicloCurso, String MateriaCurso, String alumnoCurso, String Clave,
	             String profesorCurso, int id_Curso){
	       this.CicloCurso    = CicloCurso;
	       this.MateriaCurso  = MateriaCurso;
	       this.profesorCurso = profesorCurso;
	       this.alumnoCurso   = alumnoCurso;
	       this.Clave         = Clave;
	       this.id_Curso      = id_Curso;
	}

//metodos regresar
public String RegCicloCurso(){
	return CicloCurso;
}

public String RegMateriaCurso(){
	return MateriaCurso;
}

public String RegProfesorCurso(){
	return profesorCurso;
}

public String RegAlumnoCurso(){
	return alumnoCurso;
}

public String RegClave(){
	return Clave;
}

public int RegId_Curso(){
	return id_Curso;
}

//metodos modificar
public void ModCicloCurso(String ci){
	CicloCurso = ci;
}

public void ModMateriaCurso(String mat){
	MateriaCurso = mat;
}

public void ModProfesorCurso(String pro){
	profesorCurso = pro;
}

public void ModAlumnoCurso(String alun){
	alumnoCurso = alun;
}

public void ModClave(String cla){
	Clave = cla;
}

public void Mod (int icu){
	id_Curso = icu;
}
}//Curso

class Ciclo{
	//atributos
	String NombreCiclo;
	int    id_Ciclo, anhio; 
	
	//constructor
	public Ciclo(String NombreCiclo, int id_Ciclo, int anhio){
		this.NombreCiclo = NombreCiclo;
		this.id_Ciclo    = id_Ciclo;
		this.anhio       = anhio;
	}

//metodos regresar
public String RegNombreCiclo(){
	return NombreCiclo;
}

public int RegidCiclo(){
	return id_Ciclo;
}

public int Reganhio(){
	return anhio;
}

//metodos Modificar
public void ModNombreCiclo(String nci){
	NombreCiclo = nci;
}

public void ModidCiclo(int idci ){
	id_Ciclo = idci;
}

public void Modanhio(int anh){
	anhio = anh;
}
}//ciclo

class MateriaEsc{
	//atributos
	String NombreMateria, EspecialidadMateria;
	int    id_materia;
	
	//constructor
	public MateriaEsc(String NombreMateria,String EspecialidadMateria, int id_materia){
		this.NombreMateria       = NombreMateria;
		this.EspecialidadMateria = EspecialidadMateria;
		this.id_materia          = id_materia;
	}

//metodos regresar
public String RegNombreMateria(){
	return NombreMateria;
} 

public String RegEspecialidadMateria(){
	return EspecialidadMateria;
}

public int RegIdMateria(){
	return id_materia;
}

//metodos modificar
public void ModNombreMateria(String nombM){
	NombreMateria = nombM;
}

public void ModEspecialidadMateria(String espmate){
	EspecialidadMateria = espmate;
}

public void ModIdMateria(int idma){
    id_materia = idma;
}
}//materiaesc

class Especialidad{
	//atributos
	String NombreEspecialidad, MateriaEspecializante;
	int id_Especialidad;
	
	//constructor
	public Especialidad(String NombreEspecialidad, String MateriEspecializante, int id_Especialidad){
		this.NombreEspecialidad    = NombreEspecialidad;
		this.MateriaEspecializante = MateriaEspecializante;
		this.id_Especialidad       = id_Especialidad;
	}
//metodos regresar
public String RegNombreEspecialidad(){
	return NombreEspecialidad;
} 

public String RegMateriEspecializante(){
	return MateriaEspecializante;
} 

public int RegIdEspecialidad(){
	return id_Especialidad;
} 

//metodos Modificar
public void ModnombreEspecialidad(String nombesp){
	NombreEspecialidad = nombesp;
}

public void ModMateriaEspecializante(String matesp){
	MateriaEspecializante = matesp;
}

public void Mod(int idesp){
	id_Especialidad = idesp;
}
}//especialidad