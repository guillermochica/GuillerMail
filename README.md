# GuillerMail
Programa para enviar correos desde la cuenta de correo de la UGR

Hay dos programas, uno para enviar correos desde la cuenta de los alumnos y otro para hacerlo desde la de los profesores.
El de los alumnos se llama `VentanaIniciar.java` y el de los profesores `VentanaIniciarPDI_PAS`, ambos dentro de `src/guillermail/`.
Cada programa tiene su propia configuración en NetBeans que al iniciarla pasa a la JVM el anillo de autoridades certificadoras para cada servidor (en el caso de los alumnos, el servidor es `correo.ugr.es` y su anillo `anillo_autoridades_certificadoras.keys`, en el caso de PDI/PAS, el servidor es `smtp.ugr.es` y su anillo `anillo_autoridades_certificadoras2.keys`).

