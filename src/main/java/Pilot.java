public class Pilot extends CabinCrew{
    private String pilotLicence;
    private String name;
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
        return this.getName() + " here I'm flying " + this.assignedPlane.getPlaneType();
    }
    public String getPlaneAssignedToPilot(){
        return "I am assigned to " + this.assignedPlane.getPlaneType().toString();
    }

}

