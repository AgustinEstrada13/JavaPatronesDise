package documento;

public class DocumentoTexto extends Documento{
	public void abrir() {
		System.out.println("Abriendo documento de imagen");
	}
	
	public void cerrar() {
		System.out.println("Cerrando documento de imagen");
	}

	public void guardar() {
		System.out.println("Guardando documento de imagen");
	}

	public void deshacer() {
		System.out.println("Deshaciendo ultima accion en documento de imagen");
	}
}
