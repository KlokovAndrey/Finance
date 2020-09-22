package com.project.Finance;

import com.project.Finance.Entity.GetAnswer.Answer;
import com.project.Finance.Entity.Send.Match;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @GetMapping("/main")
    public Match[] mainController() {

        RestTemplateBuilder builder = new RestTemplateBuilder();
        restTemplate(builder);
        Answer[] quote = new Answer[]{};
        try{
            quote = arun(new RestTemplate());
        } catch(Exception ex){
            ex.printStackTrace();
            System.out.println("It's EXCEPTION here");
        }
        //Match[] matches;
        ArrayList<Match> arrayList = new ArrayList();
        int k=0;
        for(int i=0;i<quote.length;i++) {
            //System.out.println(quote[i].getVideos()[0].getTitle());
            if (quote[i].getVideos()[0].getTitle().equals("Highlights")) {
                Match match = new Match(quote[i].getTitle(), quote[i].getCompetition().getName(),
                        quote[i].getVideos()[0].getEmbed());
                arrayList.add(match);
                i++;
            } else i++;
        }
            //String string1 = "Hello world!";

        Match[] matches = new Match[arrayList.size()];
        matches = arrayList.toArray(matches);
        return matches;
    }

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public Answer[] arun(RestTemplate restTemplate) throws Exception {
		//return args -> {
        Answer[] quote = new Answer[]{};
			return quote = restTemplate.getForObject(
					"https://www.scorebat.com/video-api/v1/", Answer[].class);
			//System.out.println(quote[0].getTitle());
		//};
	}

}