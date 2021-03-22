/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author stbnz
 */
@WebService(serviceName = "WSoperaciones")
public class WSoperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Enviar")
    public Boolean Enviar(@WebParam(name = "fecha")
            String fecha, @WebParam(name = "identificacion")
                    String identificacion, @WebParam(name = "nombre")
                            String nombre, @WebParam(name = "apellido")
                                    String apellido, @WebParam(name = "direccion")
                                            String direccion, @WebParam(name = "email")
                                                    String email, @WebParam(name = "celular")
                                                            String celular, @WebParam(name = "tipoSolicitud")
                                                                    String tipoSolicitud, @WebParam(name = "descripcion")
                                                                            String descripcion, String autorizacion) {
        if (fecha.equals("si")){
            return false;
            }else{
                if(identificacion.equals("si")){
                return false;
                }else{
                    if(nombre.equals("si")){
                    return false;
                    }else{
                        if(apellido.equals("si")){
                        return false;
                        }else{
                            if(direccion.equals("si")){
                            return false;
                            }else{
                                if(email.equals("si")){
                                return false;
                                }else{
                                    if(celular.equals("si")){
                                    return false;
                                    }else{
                                        if(tipoSolicitud.equals("si")){
                                        return false;
                                        }else{
                                            if(descripcion.equals("si")){
                                            return false;
                                            }else{
                                                if(autorizacion.equals("no")){
                                                    return false;
                                                }else{
                                                    return true;
                                            }   
                                        }
                                    }                                    
                                }
                            }
                        }
                    }
                }
            }        
        }
    }
}

