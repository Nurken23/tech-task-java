### Dependencies

Spring Web, Lombok

### Пример запроса

Вы можете проверить работу API с помощью следующей curl-команды:

<img width="2016" height="640" alt="image" src="https://github.com/user-attachments/assets/726f9358-718e-4476-bf27-e69b3449fcc3" />


```bash
curl -X POST http://localhost:8080/api/calculate-risk \
-H "Content-Type: application/json" \
-d '{
  "height": 180,
  "weight": 85,
  "waistCircumference": 95,
  "gender": "male"
}'
