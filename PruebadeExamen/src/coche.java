public class coche {

  private Integer numbastidor;

  private String marca;

  private String modelo;

  private Integer caballos;

  private Integer precio;

  private Integer puntos;

  public void coche(Integer NumBastidor, String Marca, String Modelo, Integer Caballos, Integer Precio, Integer Puntos) {
  }

  public void getnumbastidor() {
  }

  public void getmarca() {
  }

  public void getmodelo() {
  }

  public void getcaballos() {
  }

  public void getprecio() {
  }

  public void getpuntos() {
  }

  public void setmarca(String a) {
  }

  public void setmodelo(String m) {
  }

  public void setcaballos(Integer c) {
  }

  public void setprecio(Integer p) {
  }

  public void getpuntos(Integer n) {
  }

  public coche(Integer numbastidor, String marca, String modelo, Integer caballos, Integer precio) {
    this.numbastidor = numbastidor;
    this.marca = marca;
    this.modelo = modelo;
    this.caballos = caballos;
    this.precio = precio;
    this.puntos = puntos;
  }

  public Integer getNumbastidor() {
    return numbastidor;
  }

  public void setNumbastidor(Integer numbastidor) {
    this.numbastidor = numbastidor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Integer getCaballos() {
    return caballos;
  }

  public void setCaballos(Integer caballos) {
    this.caballos = caballos;
  }

  public Integer getPrecio() {
    return precio;
  }

  public void setPrecio(Integer precio) {
    this.precio = precio;
  }

  public Integer getPuntos() {
    return puntos;
  }

  public void setpuntos(Integer precio) {
    this.puntos = puntos;
  }

  @Override
  public String toString(){
    return "Coche [Numero de Bastidor= " +numbastidor+ ", marca=" +marca+ ", modelo= "+modelo+", caballos= "+caballos+", precio= "+precio+" ]";
  }
}