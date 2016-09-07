import java.io.*;
public class tareaOne{


	static int num[];
	public static void orden(int []a){
    	int aux;
     for(int i=0; i<num.length; i++){
    	 for(int j=i+1; j<num.length; j++){
    		if(num[i]<num[j]){
    			aux=num[i];
    			num[i]=num[j];
    			num[j]=aux;
    		}
    	 }
     }
     for(int y=0; y<num.length; y++){
    	 System.out.println(num[y]);
     }
    }
	 public static void main(String [] args)throws FileNotFoundException, IOException{
	      String texto;
              
              //Tine que ser la misma ruta para que pueda leer el archivo txt
		  String archivo=("C://Users//FEDE//Desktop//Numeros.txt");
                  
                
		  
                  System.out.println("Entrada\n");
                  
		  FileReader f=new FileReader(archivo);
		  BufferedReader b=new BufferedReader(f);
		  texto=b.readLine();
		  System.out.println(texto);
		  Integer tamano=Integer.parseInt(texto);
		  num=new int[tamano];
		    Integer a=0;
		  while((texto=b.readLine())!=null){
			  System.out.println(texto);
			 int dato=Integer.parseInt(texto);  
			  if(num[a]<tamano){
				  num[a]=dato;
			 }
			  a++;	 
		  } 		  
		  b.close();
		 
		  
		  System.out.println("\nSalida\n");
		  orden(num);
	 }
}
