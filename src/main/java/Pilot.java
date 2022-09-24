public class Pilot extends CabinCrew{
    private final String pilotLicence;
    private Plane assignedPlane;

    public Pilot(String name, RankType rankType,String pilotLicence) {
        super(name, rankType);
        this.pilotLicence = pilotLicence;
        this.assignedPlane=null;

    }

    public String getPilotLicence(){
        return this.pilotLicence;
    }
    public void getAssignedToAPlane(Plane plane){
        this.assignedPlane = plane;
    }
    public String pilotPilotsPlane(){
        if(this.assignedPlane==null){return this.getPlaneAssignedToPilot();}else {
            return this.getName() + " here I'm flying " + this.assignedPlane.getPlaneType();
        }
    }
    public String getPlaneAssignedToPilot() {
        if (this.assignedPlane == null) {
            return "I am not assigned to a plane yet";
        } else {
            return "I am assigned to " + this.assignedPlane.getPlaneType().toString();
        }
    }

}

