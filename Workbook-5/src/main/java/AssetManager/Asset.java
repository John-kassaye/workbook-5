package AssetManager;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {

        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue(){

        return originalCost;
    }

    // "%-10s: %s\n", Description,
    @Override
    public String toString() {
        return
                String.format(" %-30s %s\n", "description:" , description ) +
                String.format(" %-30s %s\n", "dateAcquired:" , dateAcquired) +
                String.format(" %-30s %2f\n", "originalCost:", originalCost);
    }
}
