
/**
 *
 * @author LabSispc01
 */
public class Secretario extends Empleado{
    
    private boolean Dispatch;
    private int FaxNumber;

    public Secretario(boolean Dispatch, int FaxNumber, String Name, String Lastname, double DNI, String Adress, int YearsIn, int PhoneNumber, double Salary, String Supervisor, double Aum) {
        super(Name, Lastname, DNI, Adress, YearsIn, PhoneNumber, Salary, Supervisor, Aum);
        this.Aum = 0.05;
        this.Dispatch = Dispatch;
        this.FaxNumber = FaxNumber;
    }

    @Override
    public String toString() {
        return "Datos de Secretario{" + "Nombre: " + Name + ", Apellido:" + Lastname + ", DNI: " + DNI + ", Direccion: " + Adress + ", Anos en la Empresa: " + YearsIn + ", Numero telefonico: " + PhoneNumber + ", Salario: " + Salary + ", Supervisor: " + Supervisor + "Despacho disponible: " + Dispatch + ", Numero de Fax: " + FaxNumber + '}';
    }
    
    

    
    
    
}
