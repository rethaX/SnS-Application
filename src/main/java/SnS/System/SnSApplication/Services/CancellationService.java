package SnS.System.SnSApplication.Services;


import SnS.System.SnSApplication.Entity.Cancellation;
import SnS.System.SnSApplication.Repositories.CancellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancellationService {

    @Autowired
    private CancellationRepository cancellationRepository;

    public List<Cancellation> getAllCancellations() {
        return cancellationRepository.findAll();
    }

    public Cancellation getCancellationById(Long id) {
        return cancellationRepository.findById(id).orElse(null);
    }

    public Cancellation createCancellation(Cancellation cancellation) {
        return cancellationRepository.save(cancellation);
    }

    public Cancellation updateCancellation(Long id, Cancellation cancellationDetails) {
        Cancellation cancellation = cancellationRepository.findById(id).orElse(null);
        if (cancellation != null) {
            cancellation.setReason(cancellationDetails.getReason());
            cancellation.setBooking(cancellationDetails.getBooking());
            return cancellationRepository.save(cancellation);
        }
        return null;
    }

    public void deleteCancellation(Long id) {
        cancellationRepository.deleteById(id);
    }
}
