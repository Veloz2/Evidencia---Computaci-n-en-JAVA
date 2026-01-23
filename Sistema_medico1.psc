//id_p = identificador del usuario
//p_name =  nombre del paciente
//id_d = indentificador del doctor
//d_name = nombre del paciente
subproceso exito <- login(admin, password)
	definir user, pass como cadena
	exito <- Falso
	
	Mientras exito = Falso Hacer
		Escribir "Ingrese usuario:"
		Leer user
		Escribir "Ingrese contraseña:"
		Leer pass
		
		Si user = admin y pass = password Entonces
			Escribir "Bienvenido"
			exito <- Verdadero
		SiNo
			Escribir "Usuario y/o contraseña incorrectos"
		FinSi
	FinMientras
FinSubProceso


SubProceso Alta_D(id_d0, d_name0 por referencia)
	Repetir
		Escribir "Ingresa el ID del doctor"
		Leer id_d
		Escribir "El ID ya se encuentra registrado"
		Si id_d = id_d0 Entonces
		FinSi
	Hasta Que id_d <> id_d0
	Escribir "Ingresa el nombre del doctor: "
	Leer d_name
	Escribir "Se ha registrado con exito. "
FinSubProceso


SubProceso Alta_P(id_p0, p_name0 por referencia)
	Repetir
		Escribir "Ingresa el ID del paciente"
		Leer id_p
		Escribir "El ID ya se encuentra registrado"
		Si id_p = id_p0 Entonces
		FinSi
	Hasta Que id_d <> id_d0
	Escribir "Ingresa el nombre del paciente: "
	Leer d_name
	Escribir "Se ha registrado con exito. "
FinSubProceso


Subproceso Crear_C(id_p0, p_name0, id_d0, d_name0 Por Referencia)
	Definir id_c, fecha, motivo como Cadena
	Definir id_p2, id_d2 Como Entero
	Escribir "ID de la cita: "
	Leer id_c
	Escribir "Ingresa Fecha y hora: "
	Leer fecha
	Escribir "Motivo de la cita"
	Leer motivo
	Escribir "Ingresa el ID del paciente: "
	Leer id_p2
	Escribir "Ingresa el ID del doctor: "
	
	Si id_p2 = id_p y id_d2 = id_d Entonces
		Escribir "Cita registrada correctamente"
		Escribir "La cita con id", id_c, "a nombre de: " + p_name, "con fecha ", fecha, "con el doctor: ", d_name, "por el motivo de " + motivo
	SiNo
		Escribir "Error: el doctor o el paciente no existe"
	FinSi
FinSubProceso


SubProceso Mostrar_datos(id_p0, p_name0, id_d0, d_name0, id_c, fecha, motivo)
	Escribir "----- Datos Registrados -----"
	Escribir "Paciente"
	Escribir " ID: ", id_p0
	Escribir " Nombre: ", p_name0
	
	Escribir "Doctor"
	Escribir " ID: ", id_d0
	Escribir " Nombre: ", d_name0
	
	Escribir "Citas"
	Escribir " ID: ", id_c
	Escribir " Fecha: ", fecha
	Escribir " Motivo: ", motivo 
FinSubProceso


SubProceso  Menu(id_p0, p_name0, id_d0, d_name0)
	Definir opcion Como Entero
	
	Repetir
		Escribir "----- Menu Principal -----"
		Escribir "1.  Dar alta doctor"
		Escribir "2.  Dar alta paciente"
		Escribir "3.  Crear cita"
		Escribir "4.  Mostrar datos"
		Escribir "5.  Salir"
		Leer opcion
		Segun opcion Hacer
			1: 
				Alta_D(id_d0, d_name0)
			2: 
				Alta_P(id_p0, p_name0)
			3:
				Crear_C(id_p0, p_name0, id_d0, d_name0)
			4:
				Mostrar_Datos(id_p0, p_name0, id_d0, d_name0, id_c, fecha, motivo)
			5: 
				Escribir "Saliendo......"
			De otro modo:
				Escribir "Opcion no valida"
		FinSegun
	Hasta Que Opcion = 5
FinSubProceso


Algoritmo Sistema
	Definir id_p0, id_d0 Como Entero
	Definir p_name0, d_name0 Como Caracter
	Definir admin, password Como Caracter
	Definir acceso Como Logico
	//Datos iniciales
	id_p0 <- 101
	p_name0 <- "Juan Perez"
	id_d0 <- 201
	d_name0 <- "Alejandro Ruiz"
	admin <- "admin1"
	password <- "0000"
	acceso <- login(admin, password)
	Si acceso = Verdadero Entonces
		Menu(id_p0, p_name0, id_d0, d_name0)
	FinSi
FinAlgoritmo