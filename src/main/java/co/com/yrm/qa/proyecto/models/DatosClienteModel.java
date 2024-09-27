package co.com.yrm.qa.proyecto.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"tipoPersona","tipoIdentificacion","identificacion","codigoSucursal","nombres","apellidos","nombreComercial","ciudad","direccion","telefono","correoFactura","tipoRegimen","responsabilidadFiscal"})
public class DatosClienteModel {
    private String tipoPersona;
    private String tipoIdentificacion;
    private String identificacion;
    private String codigoSucursal;
    private String nombres;
    private String apellidos;
    private String nombreComercial;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correoFactura;
    private String tipoRegimen;
    private String responsabilidadFiscal;
}
