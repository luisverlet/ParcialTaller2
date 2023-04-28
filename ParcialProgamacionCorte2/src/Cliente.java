
public class Cliente {
    public String nombre;
    public int ID;

    public Cliente(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre: " + nombre + ", ID: " + ID + '}';
    }
    
    
}

