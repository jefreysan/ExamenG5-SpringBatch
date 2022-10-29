package pe.unjfsc.daw.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.unjfsc.daw.entity.CEPeajeDTOEntrada;
import pe.unjfsc.daw.entity.CEPeajeDTOSalida;

public class CLPeajeProcessor implements ItemProcessor<CEPeajeDTOEntrada , CEPeajeDTOSalida> {

	  private static final Logger MOLOG = LoggerFactory.getLogger(CLPeajeProcessor.class); 

	  public CEPeajeDTOSalida process(CEPeajeDTOEntrada poItemLostPet) throws Exception { 

	     MOLOG.info("[DAW] =====[ Start process ]====="); 

	     MOLOG.info("[DAW] Data received input : {} ", poItemLostPet.toString()); 

	     CEPeajeDTOSalida oCePeajeDTOSalida = new CEPeajeDTOSalida(); 

	     oCePeajeDTOSalida.setId(poItemLostPet.getId()); 
	     oCePeajeDTOSalida.setDescripcion(poItemLostPet.getDescripcion()); 
	     oCePeajeDTOSalida.setRuc(poItemLostPet.getRuc()); 
	     oCePeajeDTOSalida.setDireccion(poItemLostPet.getDireccion()); 
	     oCePeajeDTOSalida.setUbicacion(poItemLostPet.getUbicacion()); 
	     oCePeajeDTOSalida.setFechaPeaje(poItemLostPet.getFechaPeaje()); 
	     oCePeajeDTOSalida.setHoraPeaje(poItemLostPet.getHoraPeaje()); 
	     oCePeajeDTOSalida.setTipoComprobante(poItemLostPet.getTipoComprobante());
	     oCePeajeDTOSalida.setNroComprobante(poItemLostPet.getNroComprobante());
	     oCePeajeDTOSalida.setCategoria(poItemLostPet.getCategoria());
	     oCePeajeDTOSalida.setCategoria(poItemLostPet.getCategoria());
	     oCePeajeDTOSalida.setImporte(poItemLostPet.getImporte());
	     oCePeajeDTOSalida.setIgv(poItemLostPet.getIgv());
	     oCePeajeDTOSalida.setIgv(poItemLostPet.getTotalIGV());
	     oCePeajeDTOSalida.setTotalDescuento(poItemLostPet.getTotalDescuento());

	     MOLOG.info("[DAW] New CEPeajeDTOSalida : {} ", oCePeajeDTOSalida.toString()); 
	     return oCePeajeDTOSalida; 
	  } 
	  
	  
	  public double calcularIGVTotal(double ximporte) {
		  double xigv = 0.18;
		  double xigvtotal = xigv*ximporte;
		  return xigvtotal;
	  }

	  
}

