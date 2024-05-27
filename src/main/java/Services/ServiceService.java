package Services;

import Repositories.ServiceRepository;
import Entity.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public Service createService(Service service) {
        return serviceRepository.save(service);
    }

    public Service updateService(Long id, Service serviceDetails) {
        Service service = serviceRepository.findById(id).orElse(null);
        if (service != null) {
            service.setName(serviceDetails.getName());
            service.setDescription(serviceDetails.getDescription());
            return serviceRepository.save(service);
        }
        return null;
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
