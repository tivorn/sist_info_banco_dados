package tp8;




public class Main {
	public static void main(String[] args) throws Exception {
		ConnectionDB connection = new ConnectionDB();
		connection.openConnection();
		CRUD crud = new CRUD(connection.getConnection());
		
		crud.create("O Médico e o Monstro", 2);
		crud.create("Frankstein", 2);
		crud.create("Drácula", 2);
		crud.create("O Idiota", 3);
		crud.create("O Adolescente", 3);
		
		crud.read(7);
		crud.read(8);
		crud.read(9);
		crud.read(10);
		crud.read(11);
		
		crud.delete(7);
		crud.delete(8);
		
		connection.closeConnection();
	}
}
