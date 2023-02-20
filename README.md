# 🔗 Room Database 
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/116274664/220133312-be53d577-b802-4b3e-b7b5-fa782f74970c.png">

👉 **Room DB Avantajları**
- SQL sorgularının derleme zamanındaki doğrulamasını sağlıyor.
- Kod kalabalığından kurtarıyor.
- Kolay ve anlaşılır.
- RxJava, LiveData ve Kotlin Coroutines ile kolay bir şekilde entegre oluyor.

✅ Room'da üç ana bileşen vardır:
- Veritabanını tutan ve uygulamanızın kalıcı verilerine yönelik temel bağlantı için ana erişim noktası görevi gören veritabanı sınıfı (AppDatabase)
- Uygulamanızın veritabanındaki tabloları temsil eden veri varlıkları (User Entity)
- Uygulamanızın veritabanındaki verileri sorgulamak, güncellemek, eklemek ve silmek için kullanabileceği yöntemler sağlayan veri erişim nesneleri (DAO'lar)

## 📱 App Database   
AppDatabase, veritabanı yapılandırmasını tanımlar ve kalıcı verilere uygulamanın ana erişim noktası olarak hizmet eder. 

<img width="100%" alt="image" src="https://user-images.githubusercontent.com/116274664/220127349-3d34474e-1fca-4b67-8eef-adc9bee280aa.png">


## 👤 User Entity
Her kullanıcı örneği, uygulamanın veritabanındaki bir kullanıcı tablosundaki bir satırı temsil eder.

<img width="927" alt="image" src="https://user-images.githubusercontent.com/116274664/220127069-b0a90ab3-f7a8-4f95-aee0-0b19c2e2a319.png">

## 🗄️ Data Access Object (DAO)
UserDAO, uygulamanın geri kalanının kullanıcı tablosundaki verilerle etkileşim kurmak için kullandığı yöntemleri sağlar.

<img width="937" alt="image" src="https://user-images.githubusercontent.com/116274664/220129537-949b6fa1-de45-4fe5-8651-7e870bcce2f3.png">


### Uygulama Tanıtımı
https://user-images.githubusercontent.com/116274664/220123063-b7057afa-108d-46e0-a877-cd9a4372e0a3.mov

### Referans
https://developer.android.com/training/data-storage/room#sample-implementation

