package shortestPath.orchestration;

import shortestPath.orchestration.SfcRequest;
import shortestPath.orchestration.SfcUtil;

public class main {
	public static SmallNetwork smallNetwork = new SmallNetwork();
	public static MediumNetwork mediumNetwork = new MediumNetwork();
	public static LargeNetwork largeNetwork = new LargeNetwork();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SfcRequest sfcRequest = new SfcRequest(1, 1);	
		sfcRequest.getShortestPathOrchestrationResult();
		SfcUtil.printSmallNetworkResource();
	}
}
