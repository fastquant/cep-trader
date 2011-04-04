
package TradeApp.Data.copy;


public interface HasSink {
	public <T extends DataSink> void setSink(final T sink);
	
	public <T extends DataSink> T getSink();
}
