package search.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
@Getter
@Setter
public class AppConfig {
	private String googleSearchUrl;
	private String googleApiKey;
	private String googleSearchEngineId;
}
