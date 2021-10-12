package com.coucou.cloudsys.service;

import com.coucou.cloudsys.entity.Counter;
import com.coucou.cloudsys.repository.CounterRepository;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private final static long COUNTER_ID = 100L;

    private final CounterRepository counterRepository;

    private final Counter cnt;

    public CounterService(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
        cnt = this.counterRepository.findById(COUNTER_ID)
                .orElse(new Counter(COUNTER_ID));
    }

    public long add(long value) {
        long newVal = cnt.add(value);
        counterRepository.save(cnt);
        return newVal;
    }

    public long getValue() {
        return cnt.getValue();
    }

}
