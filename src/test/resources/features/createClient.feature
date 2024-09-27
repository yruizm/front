#language: es
#Autor: Yefri Ruiz Mosquera

@RegresionSiigo
Característica: Como usuario deseo automatizar el proceso de creacion de clientes

  @CrearCliente
  Esquema del escenario: Crear Cliente
    Dado el ingreso al sitio web siigo
    Y ingrese las crendeciales para loguearme
    Y accede a la opcion clientes en el menu
    Cuando diligencia el formulario de creacion del cliente
    | tipoPersona   | tipoIdentificacion   | identificacion   | codigoSucursal   | nombres   | apellidos   | nombreComercial   | ciudad   | direccion   | telefono   | correoFactura   | tipoRegimen   | responsabilidadFiscal   | 
    | <tipoPersona> | <tipoIdentificacion> | <identificacion> | <codigoSucursal> | <nombres> | <apellidos> | <nombreComercial> | <ciudad> | <direccion> | <telefono> | <correoFactura> | <tipoRegimen> | <responsabilidadFiscal> |
    Y registra los datos de contacto
    | nombreCto   | apellidosCto   | correoCto   | cargoCto   |
    | <nombreCto> | <apellidosCto> | <correoCto> | <cargoCto> |
    Entonces valido la creacion del cliente
    Ejemplos:
      | tipoPersona | tipoIdentificacion   | identificacion | codigoSucursal | nombres     | apellidos     | nombreComercial | ciudad   | direccion          | telefono | correoFactura   | tipoRegimen        | responsabilidadFiscal | nombreCto | apellidosCto  | correoCto         | cargoCto |
      | Es persona  | Cédula de ciudadanía | 1077461368     | 406            | Tadeo Elias | Ruiz Gonzalez | Super Tadeo | Medellín  | Carrera 33 # 71-58 | 6050808 | tadeo@gmail.com | Responsable de IVA | Gran contribuyente             | Yefri | Ruiz Mosquera| yefri@ejemplo.com |   Gerente  | 
