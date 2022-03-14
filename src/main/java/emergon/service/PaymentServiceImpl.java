/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Payment;
import emergon.repo.PaymentRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo paymentRepo;
    
    @Override
    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }

    @Override
    public Payment findById(int id) {
        return paymentRepo.findById(id);
    }
    
}
