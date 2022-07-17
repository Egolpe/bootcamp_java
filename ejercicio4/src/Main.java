public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(35);
        cliente.setNombre("Enrique");
        cliente.setTelefono(666777888);
        cliente.setCredito(8000);
        System.out.println("Me llamo: " + cliente.getNombre());
        System.out.println("Tengo: " + cliente.getEdad() + " " + "años");
        System.out.println("mi númeero de teléfono es: " + cliente.getTelefono());
        System.out.println("y tengo un crédito de: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(35);
        trabajador.setNombre("Enrique");
        trabajador.setTelefono(666777888);
        trabajador.setSalario(2000);
        System.out.println("Me llamo: " + trabajador.getNombre());
        System.out.println("Tengo: " + trabajador.getEdad() + " " + "años");
        System.out.println("mi númeero de teléfono es: " + trabajador.getTelefono());
        System.out.println("y tengo un salario de: " + trabajador.getSalario());
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}