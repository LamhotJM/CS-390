package standard_exam.polymorphism.facemaker;

public class Driver {
	public static void main(String[] args) {
		
		Figure[] figArr = {new HatMaker(),
							new HatMaker(),
							new VeeMaker(),
							new ParallelMaker(),
							new FaceMaker()};		
		
		new Driver(figArr);
	}
	
	public Driver(Figure[] figures){
		for(Figure fig: figures)
		{
			System.out.print(fig.getFigure());
			
		}
	}

}
