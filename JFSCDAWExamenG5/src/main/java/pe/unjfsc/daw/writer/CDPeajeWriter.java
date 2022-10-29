package pe.unjfsc.daw.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.unjfsc.daw.entity.CEPeajeDTOSalida;



public class CDPeajeWriter implements ItemWriter<CEPeajeDTOSalida>  {

	private static final Logger LOG = LoggerFactory.getLogger(CDPeajeWriter.class); 

	  /* La salidas puede ser en distintos formatos..*/
	  public void write(List<? extends CEPeajeDTOSalida> poLostPetSalida) throws Exception { 

	     LOG.info("[DAW] =====[ Start write ]====="); 

	     LOG.info("[DAW] Object output : {} ", poLostPetSalida.toString()); 

	     for(CEPeajeDTOSalida lostPet:poLostPetSalida) { 

	        LOG.info("[DAW] lostPet read  : {}", lostPet.toString()); 

	     } 
	     
	     /*String fileName = JOptionPane.showInputDialog("Ingrese el nombre del archivo en el que se guardará,"
	     		+ "\nSi no ingresa nada se generará con la fecha");
	     
	     if(fileName.isEmpty()) {
	    	 fileName = "" + new Date().getTime();
	     }*/
	     
	     writeFileInSystem(poLostPetSalida, new Date().getTime()+".txt");

	  }
	  
	  public void writeFileInSystem(List<? extends CEPeajeDTOSalida> lostPets, String file) throws IOException {
		  LOG.info("[DAW] =====[ Empezando a generar el archivo de texto ]=====");
		  File f;
		  FileWriter w;
		  BufferedWriter bw=null;
		  PrintWriter wr=null;
		  try {
			  f = new File("src/main/resources/fuente/output/" + file);
			  w = new FileWriter(f);
			  bw=new BufferedWriter(w);
			  wr=new PrintWriter(bw);
			  for(CEPeajeDTOSalida lostPet:lostPets) {
				  wr.append(WriteObjectToTextFile(lostPet));
			  }
			  LOG.info("[DAW] =====[ Se terminó de generar el archivo de texto ]=====");
			} catch (IOException e) {
				e.printStackTrace();
				LOG.error("[DAW] =====[ Ocurrió un error al generar el archivo ]=====");
			} finally {
				if(wr!=null) {
					wr.close();
				}
				if(bw!=null) {
					bw.close();
				}
				LOG.info("[DAW] =====[ Cerrando conexión de escritura de los archivos ]=====");
			}
	  }
	  
	  public String WriteObjectToTextFile(CEPeajeDTOSalida obj) {
		  StringBuilder builder = new StringBuilder();
		  builder.append(obj.getId());
			builder.append(",");
			builder.append('"'+obj.getDescripcion()+'"');
			builder.append(",");
			builder.append('"'+obj.getRuc()+'"');
			builder.append(",");
			builder.append('"'+obj.getDireccion()+'"');
			builder.append(",");
			builder.append(obj.getUbicacion());
			builder.append(",");
			builder.append(obj.getFechaPeaje());
			builder.append(",");
			builder.append('"'+obj.getHoraPeaje()+'"');
			builder.append(",");
			builder.append(obj.getTipoComprobante());
			builder.append(",");
			builder.append(obj.getNroComprobante());
			builder.append("\n");
		  return builder.toString();
	  }
	  
	  public String addZero(int value) {
		  return (value > 9 ? "" : "0" ) + value;
	  }
	  

}
