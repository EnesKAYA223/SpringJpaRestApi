package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;


@Repository
public class HibernateCityDal implements ICityDal {
	
	private EntityManager entityManager;
	
	
	

	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	@Transactional
	@Override
	public List<City> getAll() {

	Session session=entityManager.unwrap(Session.class);
	List<City> cities=session.createQuery("from City",City.class).getResultList();
	return cities;
	
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);

		session.saveOrUpdate(city);
		
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
		Session session=entityManager.unwrap(Session.class);

		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
		Session session=entityManager.unwrap(Session.class);
		City citytoDelete=session.get(City.class, city.getID());

		session.delete(citytoDelete);
		
	}


	@Override
	public City getById(int id) {
		// TODO Auto-generated method stub
		
		Session session=entityManager.unwrap(Session.class);
		City city=session.get(City.class, id);
		return city;

	}

}
