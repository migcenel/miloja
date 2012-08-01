package miloja

class Restaurante {
	String nombre	
	String rif
	String urlImagen

    static constraints = {
		urlImagen url:true
		nombre blank:false
		rif minSize:10, maxSize:10
    }
}
