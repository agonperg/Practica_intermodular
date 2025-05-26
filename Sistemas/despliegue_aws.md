
# Despliegue de un sitio web en una instancia EC2 de AWS

## 1. Crear la máquina virtual en EC2

Ya se ha creado la máquina virtual (instancia EC2) correctamente.  
**DNS público:**  
`ec2-44-204-78-126.compute-1.amazonaws.com`

![EC2 creada](https://github.com/user-attachments/assets/4c179215-9a15-45a9-b7bb-95f1f2ab1a7a)

---

## 2. Conectarse a la instancia mediante SSH

1. Abre una terminal en la carpeta donde tengas tus archivos `.pem` o `.ppk`.
2. Usa el comando SSH proporcionado por AWS. Ejemplo:

```bash
ssh -i "tu-clave.pem" ubuntu@ec2-44-204-78-126.compute-1.amazonaws.com
```

![Conexión SSH](https://github.com/user-attachments/assets/73a61924-5589-4a10-8c18-b140837160b0)

3. Si todo ha ido bien, ya estarás conectado:

![Conexión exitosa](https://github.com/user-attachments/assets/8eb68034-d1a9-4633-8dbd-c60da7b113c8)

---

## 3. Transferir los archivos con FileZilla

1. Abre FileZilla y ve a **Archivo y luego Gestor de sitios**.
2. Crea un **Nuevo sitio** con los siguientes datos:
   - **Protocolo:** SFTP
   - **Host:** `ec2-44-204-78-126.compute-1.amazonaws.com`
   - **Usuario:** `ubuntu`
   - **Clave privada:** selecciona tu archivo `.ppk` o `.pem` según corresponda.

![Configuración de FileZilla](https://github.com/user-attachments/assets/06f83497-aca1-40a0-b18d-e93ae2ed6ea6)

3. Sube tu carpeta del sitio (por ejemplo, una que contenga `index.html`):

![Subir sitio](https://github.com/user-attachments/assets/15e58ab2-e26f-4fde-a7ed-995c62a03243)

---

## 4. Mover los archivos al directorio web

Una vez subidos, ejecuta el siguiente comando en tu terminal SSH para mover los archivos al directorio de Apache:

```bash
sudo cp -r /home/ubuntu/NOMBRE_CARPETA /var/www/html
```

Asegúrate de reemplazar `NOMBRE_CARPETA` con el nombre real de tu carpeta.

![Comando de copia](https://github.com/user-attachments/assets/de2a6acc-2bfa-4f5c-87a6-e03f4d947ed0)

---

## 5. Comprobar el despliegue

Abre tu navegador y accede a la URL:

```
http://ec2-44-204-78-126.compute-1.amazonaws.com/NOMBRE_CARPETA/
```

Si todo está correcto, deberías ver tu sitio web:

![Web funcionando](https://github.com/user-attachments/assets/23fba06f-91a2-46b2-9ad4-1dfdd5d9cc03)

