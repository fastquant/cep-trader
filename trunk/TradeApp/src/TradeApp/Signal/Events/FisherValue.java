package TradeApp.Signal.Events;

import java.util.Date;

public class FisherValue extends SignalValue {
	
	public FisherValue(final String name, final String date, final double param,
		final SignalValue... innerValues) {
		super(name, date, param, innerValues);
	}
	
	public FisherValue(final String name, final Date date, final double param,
		final SignalValue... innerValues) {
		super(name, date, param, innerValues);
	}
	
	public FisherValue(final String name, final String innerName,
		final String date, final double param,
		final SignalValue... innerValues) {
		super(name, innerName, date, param, innerValues);
	}
	
	public FisherValue(final String name, final String innerName,
		final Date date, final double param,
		final SignalValue... innerValues) {
		super(name, innerName, date, param, innerValues);
	}
	
	public FisherValue(final String name, final String innerName,
		final String date, final double param) {
		super(name, innerName, date, param);
	}
	
	public FisherValue(final String name, final String innerName,
		final Date date, final double param) {
		super(name, innerName, date, param);
	}
	
}
