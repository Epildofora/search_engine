package searchengine.dto.statistics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class SearchResults {
    private boolean result;
    private int count;
    private List<StatisticsSearch> data;

    public SearchResults(boolean result) {
        this.result = result;
    }
}

