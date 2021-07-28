package com.unicomer.utils;

/**
 * CommonConstants.
 *
 * @author Jonie Miralda <mailto:jecruz@latam.stefanini.com />
 * @version 1.0.0
 * @see
 * @since 02-04-2020 11:38:00 AM 2020
 */
public final class CommonConstants {

	/** Attribute that determine a Constant of PRODUCE_SWAGGER. */
	public static final String PRODUCE_SWAGGER = "application/json";

	/** Attribute that determine a Constant of HTTP_METHOD_GET. */
	public static final String HTTP_METHOD_GET = "GET";

	/** Attribute that determine a Constant of HTTP_METHOD_POST. */
	public static final String HTTP_METHOD_POST = "POST";

	/** Attribute that determine a Constant of HTTP_METHOD_PUT. */
	public static final String HTTP_METHOD_PUT = "PUT";

	/** Attribute that determine a Constant of SWAGGER_UI. */
	public static final String SWAGGER_UI = "swagger-ui.html";

	/** Attribute that determine a Constant of SWAGGER_CLASSPATH_RESOURCES. */
	public static final String SWAGGER_CLASSPATH_RESOURCES = "classpath:/META-INF/resources/";

	/** Attribute that determine a Constant of SWAGGER_CLASSPATH_WEBJARS. */
	public static final String SWAGGER_CLASSPATH_WEBJARS = "classpath:/META-INF/resources/webjars/";

	/** Attribute that determine a Constant of SWAGGER_WEBJARS. */
	public static final String SWAGGER_WEBJARS = "/webjars/**";

	/** Attribute that determine the constant SWAGGER_API_VERSION. */
	public static final String SWAGGER_API_VERSION = "1.0";

	/** Attribute that determine the constant LICENSE_TEXT. */
	public static final String LICENSE_TEXT = "Tigo El Salvador";

	/** Attribute that determine a Constant of PROTOCOL. */
	public static final String PROTOCOL = "http://";

	/** Attribute that determine a Constant of IP_PRODUCCTION. */
	public static final String IP_PRODUCCTION = "192.168.162.15:";

	/** Attribute that determine a Constant of URL. */
	public static final String URL = PROTOCOL + IP_PRODUCCTION;

	/** Attribute that determine a Constant of USER_PORT. */
	public static final String USER_PORT = "9102";

	/** Attribute that determine a Constant of AUTH_PORT. */
	public static final String AUTH_PORT = "9100";

	/** Attribute that determine a Constant of PLUGIN_PORT. */
	public static final String PLUGIN_PORT = "9103";

	/** Attribute that determine a Constant of LOG_PORT. */
	public static final String LOG_PORT = "9101";

	/** Attribute that determine a Constant of ROL_PORT. */
	public static final String ROL_PORT = "9104";

	/** Attribute that determine a Constant of LIST_PORT. */
	public static final String LIST_PORT = "9105";

	/** Attribute that determine a Constant of ROL_PORT. */
	public static final String CONFIG_PORT = "9106";

	/** Attribute that determine a Constant of ACCOUNT_STATE_PORT. */
	public static final String ACCOUNT_STATE_PORT = "9200";

	/** Attribute that determine a Constant of BACKTONE_PORT. */
	public static final String BACKTONE_PORT = "9202";

	/** Attribute that determine a Constant of INFORMATION_PORT. */
	public static final String INFORMATION_PORT = "9203";

	/** Attribute that determine a Constant of MS_PORT. */
	public static final String MS_PORT = "9206";

	/** Attribute that determine a Constant of LOANS_PORT. */
	public static final String LOANS_PORT = "9207";

	/** Attribute that determine a Constant of USER_URL. */
	public static final String USER_URL = URL + USER_PORT;

	/** Attribute that determine a Constant of AUTH_URL. */
	public static final String AUTH_URL = URL + AUTH_PORT;

	/** Attribute that determine a Constant of PLUGIN_URL. */
	public static final String PLUGIN_URL = URL + PLUGIN_PORT;

	/** Attribute that determine a Constant of LOG_URL. */
	public static final String LOG_URL = URL + LOG_PORT;

	/** Attribute that determine a Constant of ROL_URL. */
	public static final String ROL_URL = URL + ROL_PORT;

	/** Attribute that determine a Constant of LIST_URL. */
	public static final String LIST_URL = URL + LIST_PORT;

	/** Attribute that determine a Constant of ROL_URL. */
	public static final String CONFIG_URL = URL + CONFIG_PORT;

	/** Attribute that determine a Constant of ROL_URL. */
	public static final String ACCOUNT_STATE_URL = URL + ACCOUNT_STATE_PORT;

	/** Attribute that determine a Constant of BACKTONE_URL. */
	public static final String BACKTONE_URL = URL + BACKTONE_PORT;

	/** Attribute that determine a Constant of INFORMATION_URL. */
	public static final String INFORMATION_URL = URL + INFORMATION_PORT;

	/** Attribute that determine a Constant of MS_URL. */
	public static final String MS_URL = URL + MS_PORT;

	/** Attribute that determine a Constant of LOANS_URL. */
	public static final String LOANS_URL = URL + LOANS_PORT;

	/** Attribute that determine a Constant of LIST. */
	public static final String LIST = "/list";

	/** Attribute that determine a Constant of SHOW. */
	public static final String SHOW = "/show/{id}";

	/** Attribute that determine a Constant of NEW. */
	public static final String NEW = "/new";

	/** Attribute that determine a Constant of EDIT. */
	public static final String EDIT = "/edit";

	/** Attribute that determine a Constant of DELETE. */
	public static final String DELETE = "/delete";

	/** Attribute that determine a Constant of EXECUTE. */
	public static final String EXECUTE = "/execute";

	/** Attribute that determine a Constant of USER_NAME_VALIDATION. */
	public static final String USER_NAME_VALIDATION = "User name should have at least 1 character";

	/**
	 * Attribute that determine a constant of REQUEST_TIMEOUT.
	 */
	public static final String REQUEST_TIMEOUT = "com.sun.xml.internal.ws.request.timeout";

	/**
	 * Attribute that determine a constant of CONNECT_TIMEOUT.
	 */
	public static final String CONNECT_TIMEOUT = "com.sun.xml.internal.ws.connect.timeout";

	/**
	 * Attribute that determine a constant of REQUEST_TIMEOUT_VALUE.
	 */
	public static final int REQUEST_TIMEOUT_VALUE = 50000;

	/**
	 * Attribute that determine a constant of CONNECT_TIMEOUT_VALUE.
	 */
	public static final int CONNECT_TIMEOUT_VALUE = 50000;

	/** Attribute that determine a Constant of OK. */
	public static final String OK = "OK";

	/** Attribute that determine a Constant of BAD_REQUEST. */
	public static final String BAD_REQUEST = "Bad request";

	/** Attribute that determine a Constant of INTERNAL_SERVER_ERROR. */
	public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
	
	/** Attribute that determine a Constant of INTERNAL_SERVER_ERROR. */
	public static final String NOT_PERMISSION = "No puede realizar cambios a un usuario inactivo";

	/** Attribute that determine a Constant of NOT_FOUND. */
	public static final String NOT_FOUND = "Not Found";

	/** Attribute that determine a Constant of FOUND. */
	public static final String FOUND = "Found";

	/** Attribute that determine a Constant of NOT_MODIFIED. */
	public static final String NOT_MODIFIED = "Not Modified";
	
	/** Attribute that determine a Constant of CONFLICT. */
	public static final String CONFLICT = "Conflict";

	/** Attribute that determine a Constant of UNAUTHORIZED. */
	public static final String UNAUTHORIZED = "Unauthorized";

	/** Attribute that determine a Constant of HIBERNATE_LAZY_INITIALIZER. */
	public static final String HIBERNATE_LAZY_INITIALIZER = "hibernateLazyInitializer";

	/** Attribute that determine a Constant of HANDLER. */
	public static final String HANDLER = "handler";

	/** Attribute that determine a Constant of SEQUENCE. */
	public static final String SEQUENCE = "SEQUENCE";

	/** Attribute that determine a Constant of VALID_JSON. */
	public static final String VALID_JSON = "Return valid JSON from service";

	/** Attribute that determine a Constant of EXCECUTION_SUCCESSFUL. */
	public static final String EXCECUTION_SUCCESSFUL = "Excecution successful";

	/** Attribute that determine a Constant of OPERATION_SUCCESSFUL. */
	public static final String OPERATION_SUCCESSFUL = "Operation successful";
	
	public static final String EXCECUTION_TIMEOUT = "Excecution Timeout WS";
	
	public static final String EXCECUTION_TIMEOUT_PL = "Excecution Timeout PL";
	
	/** Attribute that determine a Constant of DELETE_EVENT. */
	public static final String DELETE_EVENT = "Delete event object";

	/** Attribute that determine a Constant of DELETE_EVENT. */
	public static final int HTTP_CODE_ERROR_INTERNAL_SERVICE = 500;
	
	public static final int HTTP_CODE_ERROR_FORBIDDEN= 403;
	
	public static final int HTTP_CODE_ERROR_TIMEOUT= 408;
	
	/** Attribute that determine a Constant of DELETE_EVENT. */
	public static final int HTTP_CODE_SUCCES = 200; 
	
	/** Attribute that determine a Constant of DELETE_EVENT. */
	public static final int HTTP_CODE_NO_CONTENT = 204;
	
	public static final int HTTP_CODE_UNAUTHORIZED = 403;
	/** Attribute that determine a Constant of DELETE_EVENT. */
	public static final int HTTP_CODE_UNAUTHORIZER = 401;
	/** Attribute that determine a Constant of DELETE_EVENT. */
	public static final int HTTP_CODE_PRECONDITION_FAILED = 412;
	
	public static final int HTTP_CODE_CONFLICT = 409;
	
	public static final int HTTP_CODE_BAD_REQUEST = 400;
	
	
	
	
	
	/** Attribute that determine a Constant of EXCECUTION_SUCCESSFUL. */
	public static final String EXCECUTION_NO_CONTENT = "Registros no encontrados";
	
	public static final String EXECUTION_FAIL = "No tiene permiso";
	
	public static final String FIND_ACCOUNT_SUCCESS_CODE = "00";
	
	public static final String ADMIN_PAGO_SUCCESS_CODE = "0000";
	
	public static final String ANEXO_ID = "anexo";
	
	public static final String CODIGO_CLIENTE_ID = "codigoCliente";
	public static final String NOMBRE_CLIENTE_ID = "nombreCliente";
	public static final String TELEFONO_ID = "telefono";
	
	
	public static final String EDS_CODIGO = "WS-001";
	public static final String ACCESS_DENIED = "Access Denied";
	public static final String EDS_CODIGO_WSPAGO_EN_LINEA = "WS-003";// 
	
	public static final String EDS_CODIGO_ABONO = "WS-002";
	
	public static final String EDS_CODIGO_PL003 = "PL-003"; 
	public static final String EDS_CODIGO_BD001 = "BD-001";
	public static final String EDS_CODIGO_PL002 = "PL-002";
	public static final String EDS_CODIGO_PL001 = "PL-001";
	public static final String EDS_CODIGO_PL004 = "PL-004";
	
	public static final Integer MAX_FILL=16;
	public static final Integer ACTIVO=1;
	public static final Integer INACTIVO=0;
	
	public static final String ACEPTA_PAGO_CHEQUE="1";
	
	public static final String PAGO_TARJETA="2";
	
	public static final Long ESTADO_ACTIVO=1L;
	
	public static final String PRECONDITION_FAILED = "Fallo la validacion de modelo";
	
	// Attribute that describe an entity custom error
	public static final Integer DATABASE_ERROR = 10020;
	// Attribute that describe an entity custom error
	public static final Integer TOKEN_ERROR = 11003;
	
	public static final Integer GENERIC_ERROR = 10002;
	
	public static final String PRUEBA_ERROR = "1000000001";
	
	public static final Integer GENERIC_TOKEN_ERROR = 11001;
	/* Api Catalog Header params*/
	public static final String DESCRIPTION_HEADER_ERROR = "14001";
	public static final Integer BOOLEAN_ERROR = 14002;
	/**/
	
	public static final Integer CREDENCIALES_ERROR = 10003;
	
	public static final Integer PASSWORD_ERROR = 10002;
	
	public static final Integer USER_ERROR = 10001;
	
	public static final Integer PERSON_ID = 12002;
	
	
	public static final Integer FINDPERSON = 12001;
	
	public static final Integer REQUEST = 17002;
	
	public static final Integer PASSWORD_SUCCESSFUL = 200;

	public static final Integer PASSWORD_IN_USE = 204;
	public static final String NOMBRE_REPORTE = "Sistema Antifraude - SPDE Mobile Cash";
	public static final String INSERCION_EXITOSA = "Insercion exitoso";
	public static final String ELIMINACION_DATA_EXITOSA = "Se elimino el registro de manera exitoso";
	public static final String ELIMINACION_DATA_FALLIDA = "Intento de eliminacion fallida";
	public static final String INSERCION_FALLIDA = "Insercion fallida";
	public static final String NO_FOUND = "No se encontraron registros para mostrar";
	public static final String NO_DATA_ELIMINATION_FOUND = "No se encontro el registro a eliminar";
	public static final String ERROR_ACTUALIZAR_CASO = "El caso no se puede modificar por que sobrepasa la cantidad de dias habiles";
	public static final String ERROR_ACTUALIZAR_CASO_CERRADO = "No se permite modificar la información del caso, el estado debe ser Abierto";
	public static final String RESULTADO_EXITOSO = "Resultado exitoso";
	public static final String ACTUALIZACION_EXITOSA = "Se actualizo el registro con exito";
	public static final String ELIMINACION_EXITOSA = "Se elimino el archivo con exito";
	public static final String ERROR_ACTUALIZAR_DATO_ADJUNTO = "";
	public static final String EXPORTANDO_REPORTE_EXITOSO = "Reporte exportado exitosamente";
	public static final String INSERCION = "Insercion";
	public static final String ACTUALIZACION = "Actualizacion";
	public static final String ELIMINACION = "Eliminacion";
	public static final String REPORTECSV = "Generando reporte";
	public static final String REPORTECSV_GENERADO = "Generando con exito";
	public static final String REPORTECSV_FALLIDO = "Error al Generar reporte";
	public static final String FECHA_NO_VALIDA = "El filtro de fecha no es valida";
	
	public static final String EMAIL_ALERTA_ASUNTO = "Alerta de seguridad";
	public static final String EMAIL_ALERTA_MENSAJE = "Estimado(a) Cliente,\n\nAdjunto encontrará información de alertas generadas.\n\nPuede consultar y efectuar validaciones de los siguientes datos";
	
	public static final String EMAIL_REASIGNACION_CASO_ASUNTO = "Notificación Información Casos";
	public static final String EMAIL_REASIGNACION_CASO_MENSAJE = "Se le ha asignado el caso con Nro. ";
	
	public static final String EMAIL_MODIFICACION_ESTADO_CASO = "Notificación Información Casos";
	public static final String EMAIL_MODIFICACION_ESTADO_CASO_MENSAJE = "El estado del caso con Nro. %s ha cambiado.";
	public static final String EMAIL_MODIFICACION_DATA_CASO="La información del caso Nro. %s ha sido modificada";
	
	public static final String EMAIL_MODIFICACION_CASO = "Notificación Información Casos";
	public static final String EMAIL_MODIFICACION_CASO_MENSAJE = "El estado del caso con Nro. %s ha sido modificado";
	
	public static final String HTTP_MESSAGE_BAD_REQUEST = "Seleccionar un archivo";
	public static final String HTTP_MESSAGE_BAD_EXTENSION = "El tipo de archivo no es aceptado";
	
	public static final Integer CASE_IS_CLOSED = 3;
	/**
	 * Instantiates a new common constants.
	 */
	private CommonConstants() {
	}

}
