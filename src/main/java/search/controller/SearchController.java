package search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.util.UriComponentsBuilder;
import search.config.AppConfig;
import search.dto.SearchResult;

@RestController
@RequestMapping(value = "/api/search")
public class SearchController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	AppConfig appConfig;

	@GetMapping
	SearchResult search(@RequestParam("query") String searchQuery) {
		return restTemplate.getForObject(getQueryUrl(searchQuery), SearchResult.class);
	}

	private String getQueryUrl(String searchQuery) {
		return UriComponentsBuilder.newInstance()
				.scheme("https")
				.host(appConfig.getGoogleSearchUrl())
				.queryParam("key", appConfig.getGoogleApiKey())
				.queryParam("cx", appConfig.getGoogleSearchEngineId())
				.queryParam("q", searchQuery)
				.build()
				.toString();
	}

}
