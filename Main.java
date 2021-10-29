class Main {
  public static void main(String[] args) 
  {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f); //primera solución
    System.out.println(cir);
    cir.setRadio((float)7.33); //Segunda solución
    System.out.println(cir);
    float var = -8.66f;
    cir.setRadio(var);
    System.out.println(cir);


    System.out.println("############# Composicion ###############");
    Persona persona1 = new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha = new Fecha(2,1,2021);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getFNacimiento().getAnio());


    System.out.println("############# Composicion 2 ###############");
    Persona persona2 = new Persona("Rafael", "Zavala", 8,4,1998);
    System.out.println(persona2);


    System.out.println("############# Clase Coche ###############");

    Coche p1 = new Coche("Ford", 2021, "negro", 4, true, 150, "Ignacio", "Chavez", 11, 9, 1999, "Chofer");
    System.out.println(p1);
    System.out.println(" ");

    Coche p2 = new Coche("Ford", 2021, "negro", 4, true, 150, "Monica", "Alvrez", 24, 2, 2002, "Copiloto");
    System.out.println(p2);
    System.out.println(" ");

    Coche p3 = new Coche("Ford", 2021, "negro", 4, true, 150, "Martin", "Orozco", 30, 12, 1990, "Pasajero 1");
    System.out.println(p3);
    System.out.println(" ");

    Coche p4 = new Coche("Ford", 2021, "negro", 4, true, 150, "Brayan", "Cova", 5, 3, 2000, "Pasajero 2");
    System.out.println(p4);
    System.out.println(" ");

  }
}