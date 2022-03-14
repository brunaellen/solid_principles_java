package br.com.alura.rh.service.promotion;

import br.com.alura.rh.ValidationException;
import br.com.alura.rh.model.Employee;
import br.com.alura.rh.model.Role;

public class PromotionService {
    public void promote(Employee employee, boolean enabledForPromotion) {
        Role currentRole = employee.getRole();
        if(currentRole.equals(Role.MANAGER)) {
            throw new ValidationException("Employee has already the highest role. Managers cannot be promoted");
        }

        if(enabledForPromotion) {
            Role newRole = currentRole.getNextRole();
            employee.promote(newRole);
        } else {
            throw new ValidationException("Employee is not suitable for promotion");
        }
    }
}
