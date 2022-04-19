package com.novatec.backend.common;

import lombok.Data;

@Data
public class GenericResponse {

    private Object object;
    private String errorMessage;
    private String successMessage;
    private ResultStatus resultStatus;
    private Integer errorCode;

    /**
     * Metodo encargado de setear la respuesta del success con la información
     * suficiente para responder al cliente que realiza la solicitus, adicional
     * se retornará información especifica sobre la propiedad Object.
     *
     * @param object
     */
    public void success(Object object) {
        setObject(object);
        setResultStatus(ResultStatus.OK);
        setSuccessMessage(ResponseEnum.CODE_SUCCESS.name());
    }

    /**
     * Metodo encargado de setear la respuesta del success con la información
     * suficiente para responder al cliente que realiza la solicitdu.
     */
    public void success() {
        setResultStatus(ResultStatus.OK);
        setSuccessMessage(ResponseEnum.CODE_SUCCESS.name());
    }

    /**
     * Metodo encargado de setear la respuesta del failure con la información
     * suficiente para responder al cliente que realiza la solicitud.
     *
     * @param coreException Exception lanzada desde el servicio.
     */
    public void failure(CoreException coreException) {
        setResultStatus(ResultStatus.FAILURE);
        setErrorMessage(coreException.getError().name());
        setErrorCode(500);
    }

    /**
     *
     * @param ex
     */
    public void failure(Exception ex) {
        setResultStatus(ResultStatus.FAILURE);
        setErrorMessage(ex.getMessage());
        setErrorCode(500);
    }
}
