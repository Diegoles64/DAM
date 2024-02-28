public class camion extends coche {

  private Integer motor;

  public void camion() {
  }

  public void getmotor() {
  }

  public void setmotor(Integer t) {
  }

  public camion(Integer NumBastidor, String Marca, String Modelo, Integer Caballos, Integer Precio, Integer motor) {
    super(NumBastidor, Marca, Modelo, Caballos, Precio);
    this.motor = motor;
  }

  public Integer getMotor() {
    return motor;
  }

  public void setMotor(Integer motor) {
    this.motor = motor;
  }

  public String toString(){
    return "camion [motor= "+motor+" ]";
  }
}