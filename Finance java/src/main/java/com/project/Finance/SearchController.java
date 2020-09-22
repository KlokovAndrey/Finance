package com.project.Finance;

import com.project.Finance.Entity.GetAnswer.NewEntry;
import com.project.Finance.Entity.Send.Entry;
import com.project.Finance.Entity.Send.Match;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SearchController {

    @GetMapping("/search")
    public Entry[] mainController() {
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1000, "pets", new Date()));

        Entry[] entriesArr = new Entry[entries.size()];
        entriesArr = entries.toArray(entriesArr);
        //String string = "The day that never comes";
        //Entry entry = new Entry(1000, "pets");
        return entriesArr;

    }


    @PostMapping("/add")
    public void addController(@RequestBody NewEntry newEntry){
        System.out.println(newEntry);
        Entry entry = new Entry();
        newEntry.convertToEntry(entry);
        String login = newEntry.getLogin();
    }
}
