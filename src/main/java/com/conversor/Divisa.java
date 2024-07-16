package com.conversor;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Divisa  {
		
	private String result;
	private String documentation;
	private String terms_of_use;
	private String time_last_update_unix;
	private String time_last_update_utc;
	private String time_next_update_unix;
	private String time_next_update_utc;
	private String base_code;
	private ConversionRates conversion_rates;

    @Getter
    @Setter
    public class ConversionRates {
        private double MXN;
        private double USD;
        private double CAD;
        private double EUR;
    }

}



