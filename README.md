
## 🚀 Servicios

### 1. `auth-service`
- Expone un endpoint para login.
- Genera JWT válidos.
- Produce un mensaje a Kafka al autenticarse exitosamente.

### 2. `kafka-service`
- Kafka + Zookeeper + Producer/Consumer para registrar eventos de login.

### 3. `data-service`
- Requiere un JWT válido para acceder.
- Consume datos protegidos desde una API externa o mock.

---

## 🔧 Requisitos

- Docker y Docker Compose
- JDK 17 o superior (para los servicios en Java)
- Git (si usás submódulos)

---

## 🐳 Cómo correr todo junto

```bash
git clone --recurse-submodules https://github.com/tu-usuario/proyecto-integrador.git
cd proyecto-integrador
docker-compose up --build
