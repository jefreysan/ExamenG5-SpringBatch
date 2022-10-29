package pe.unjfsc.daw.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.unjfsc.daw.entity.CEPeajeDTOEntrada;


public class CLPeajeMapper implements FieldSetMapper<CEPeajeDTOEntrada> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CLPeajeMapper.class);
	/*Aquí podemos hacer algunas validaciones también*/
	@Override
	public CEPeajeDTOEntrada mapFieldSet(FieldSet fieldSet) throws BindException {
		 MOLOG.info("[DAW] =====[ Start mapFieldSet ]====="); 
	     MOLOG.info("[DAW] read record : {} ", fieldSet.toString()); 
	     CEPeajeDTOEntrada oCePeajeDTOEntrada = new CEPeajeDTOEntrada(); 
	     oCePeajeDTOEntrada.setId(fieldSet.readInt("id")); 
	     oCePeajeDTOEntrada.setDescripcion(fieldSet.readString("descripcion")); 
	     oCePeajeDTOEntrada.setRuc(fieldSet.readString("ruc")); 
	     oCePeajeDTOEntrada.setDireccion(fieldSet.readString("direccion")); 
	     oCePeajeDTOEntrada.setUbicacion(fieldSet.readString("ubicacion")); 
	     oCePeajeDTOEntrada.setFechaPeaje(fieldSet.readString("fechapeaje")); 
	     oCePeajeDTOEntrada.setHoraPeaje(fieldSet.readString("horapeaje")); 
	     oCePeajeDTOEntrada.setTipoComprobante(fieldSet.readString("tipocomprobante"));
	     oCePeajeDTOEntrada.setNroComprobante(fieldSet.readString("nroComprobante"));
	     oCePeajeDTOEntrada.setImporte(fieldSet.readDouble("importe"));
	     oCePeajeDTOEntrada.setIgv(fieldSet.readDouble("igv"));
	     oCePeajeDTOEntrada.setTotalIGV(fieldSet.readDouble("totaligv"));
	     oCePeajeDTOEntrada.setTotalDescuento(fieldSet.readDouble("totaldescuento"));

	     MOLOG.info("[DAW] Mapper to CLPeajeMapper : {}", oCePeajeDTOEntrada.toString()); 
	     return oCePeajeDTOEntrada; 
	} 
 /*
  * 	Nos permite mapear los datos que vienen del archivo, en este
  *     caso json a el objeto respectivo(CEPeajeDTOEntrada)
  * */
}
