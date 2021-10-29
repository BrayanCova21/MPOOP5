class Coche
{
  //Sección de atributos

  String color;
  String marca;
  int numPuertas;
  int anio;
  int potencia;
  boolean automatico;
  Persona persona;


  //Sección de constructores

  public Coche(){} 
  
  public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia)
  {
    this.marca = marca;
    this.anio = anio;
    this.color = color;
    this.numPuertas = numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
  }



  public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia, String nombre, String apellido, int dia, int mes, int aniop, String lugar)
  {
    this.marca = marca;
    this.anio = anio;
    this.color = color;
    this.numPuertas = numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
    persona = new Persona (nombre, apellido, dia, mes, aniop, lugar);
  }



  //Sección de métodos

  public void encender()
  {
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
  }


  public void avanzar(boolean avanza)
  {
    if(avanza)
    {
      System.out.println("Estoy avanzando a 10 Km/h");
    }
    else
    {
      System.out.println("Voy a 0 Km/h");
    }
  }


  public void apagar()
  {
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
  }


  public void frenar(boolean frena)
  {
    if(frena)
    {
      System.out.println("Estoy frenando");
    }
    else
    {
      System.out.println("No estoy frenando");
    }
  }


  public void abrirPuertas(int numPuertasAAbrir)
  {
    if(numPuertasAAbrir > numPuertas)
    {
      System.out.println("El número de puertas a abrir es mayor al número de puertas del coche");
    }
    else
    {
      System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }
  }


  @Override
  public String toString()
  {
    return "Coche{"+"marca:"+marca+" anio:"+anio+" color:"+color+" numPuertas:"+numPuertas+" automatico:"+automatico+" potencia:"+potencia+" "+persona+"}";
  }

}