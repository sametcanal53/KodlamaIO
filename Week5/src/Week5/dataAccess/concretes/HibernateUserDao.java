package Week5.dataAccess.concretes;

import java.util.List;

import Week5.dataAccess.abstracts.UserDao;
import Week5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Do�rulama linki  " + user.getEmail() + " adresine g�nderilmi�tir.");
		System.out.println("Sisteme yeni kay�t yap�ld� ; \nAd� = " + user.getName() + "\nSoyad� = " + user.getLastName()
				+ "\nE-Mail = " + user.getEmail() + "\n");
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silindi : " + user.getEmail());

	}

	@Override
	public void update(User user) {
		System.out.println("Sistem bilgisi g�ncellendi : " + user.getEmail());

	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
