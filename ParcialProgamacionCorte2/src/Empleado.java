import java.util.*;

public class Empleado {
    public String Name;
    public String Lastname;
    public double DNI;
    public String Adress;
    public int YearsIn;
    public int PhoneNumber;
    public double Salary;
    public String Supervisor;
    public double Aum;
    Scanner sc = new Scanner(System.in);

    public Empleado(String Name, String Lastname, double DNI, String Adress, int YearsIn, int PhoneNumber, double Salary, String Supervisor,double Aum) {
        this.Name = Name;
        this.Lastname = Lastname;
        this.DNI = DNI;
        this.Adress = Adress;
        this.YearsIn = YearsIn;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Supervisor = Supervisor;
        this.Aum = Aum;
    }


    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Name + ", Apellido=" + Lastname + ", DNI=" + DNI + ", Direccion=" + Adress + ", Anos en la Empresa=" + YearsIn + ", Numero telefonico=" + PhoneNumber + ", Salario=" + Salary + ", Supervisor=" + Supervisor + '}';
    }
    
    public void CambiarSupervisor(){
        
        System.out.println("Introduzca nombre de nuevo supervisor");
        Supervisor = sc.next();
        
}
    
    public void IncremetarSalario(){
        
        if (YearsIn>1) {
            
            double Salaryaum = Salary*Aum;
            Salary=Salary+Salaryaum;
            System.out.println("Sueldo aumentado, nuevo sueldo = " + Salary);
            
        }else{
            
            System.out.println("El empleado no cumple con el tiempo necesario para el incremento");
            
        }
    }
    
              
}
