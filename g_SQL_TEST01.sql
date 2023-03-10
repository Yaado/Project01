-- 코드를 입력하세요
SELECT YEAR
       ,MONTH
       ,COUNT(USER_ID) AS PURCHASED_USERS
       ,TO_CHAR(ROUND(COUNT(USER_ID)/ALL_COUNT,1),'FM0.0') AS PURCHASED_RATIO
  FROM(
    SELECT DISTINCT(B.USER_ID) AS USER_ID
           , TO_CHAR(SALES_DATE,'MM') AS MONTH
           , TO_CHAR(SALES_DATE,'YYYY') AS YEAR
           ,(
             SELECT COUNT(*) 
             FROM USER_INFO 
             WHERE JOINED BETWEEN TO_DATE('2020-12-31','YYYY-MM-DD')
               AND TO_DATE('2022-01-01','YYYY-MM-DD')
            ) AS ALL_COUNT
      FROM USER_INFO A
      INNER JOIN ONLINE_SALE B ON A.USER_ID = B.USER_ID
     WHERE A.JOINED BETWEEN TO_DATE('2020-12-31','YYYY-MM-DD')
       AND TO_DATE('2022-01-01','YYYY-MM-DD')
    ) AA
 WHERE 1=1
 GROUP BY MONTH, YEAR, ALL_COUNT
 ORDER BY MONTH