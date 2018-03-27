package ServerSocketDome;

import java.io.Serializable;

public class User implements Serializable{  //ø…–Ú¡–ªØ
			private String name;
			private String mima;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getMima() {
				return mima;
			}
			public void setMima(String mima) {
				this.mima = mima;
			}
			public void User(String name,String mima) {
				this.name=name;
				this.mima=mima;
			}
}
