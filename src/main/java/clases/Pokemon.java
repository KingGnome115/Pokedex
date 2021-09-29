package clases;

/**
 *
 * @author Kevin
 */
public class Pokemon
{
    public static final byte Agua = 1;
    public static final byte Fuego = 2;
    public static final byte Tierra = 3;
    public static final byte Electrico = 4;
    
    private String nombre;
    private String numero;
    private float altura;
    private float peso;
    private boolean sexo;
    private String categoria;
    private String habilidad;
    private String tipos;

    /**
     * Método para crear un nuevo Pokemon
     * @param nombre del pokemon
     * @param numero del pokemon
     * @param altura del pokemon
     * @param peso en kg del pokemon
     * @param sexo hombre o mujer
     * @param categoria a la que pertenece el pokemon
     * @param habilidad del pokemon
     * @param tipos variables estaticas
     */
    public Pokemon(String nombre, String numero, float altura, float peso, boolean sexo, String categoria, String habilidad, String tipos)
    {
        this.nombre = nombre;
        this.numero = numero;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.categoria = categoria;
        this.habilidad = habilidad;
        this.tipos = tipos;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the numero
     */
    public String getNumero()
    {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    /**
     * @return the altura
     */
    public float getAltura()
    {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public float getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    /**
     * @return the sexo
     */
    public boolean isSexo()
    {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(boolean sexo)
    {
        this.sexo = sexo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria()
    {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    /**
     * @return the habilidad
     */
    public String getHabilidad()
    {
        return habilidad;
    }

    /**
     * @param habilidad the habilidad to set
     */
    public void setHabilidad(String habilidad)
    {
        this.habilidad = habilidad;
    }

    /**
     * @return the tipos
     */
    public String getTipos()
    {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(String tipos)
    {
        this.tipos = tipos;
    }

    
    
    
}
