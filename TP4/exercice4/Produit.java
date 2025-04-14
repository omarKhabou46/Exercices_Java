public class Produit {
    private long id;
    private String name;
    private String marque;
    private Double prix;
    private String description;
    private int nombre_en_stock ;

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nombre_en_stock=" + nombre_en_stock +
                '}';
    }

    public Produit(long id, String name, String marque, Double prix, int nombre_en_stock, String description) {
        this.id = id;
        this.name = name;
        this.marque = marque;
        this.prix = prix;
        this.nombre_en_stock = nombre_en_stock;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombre_en_stock() {
        return nombre_en_stock;
    }

    public void setNombre_en_stock(int nombre_en_stock) {
        this.nombre_en_stock = nombre_en_stock;
    }
}
