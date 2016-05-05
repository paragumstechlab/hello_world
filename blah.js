/*Created On 5th May 2016*/
<script type="text/javascript">
  var email = "{{ email }}";
  var customer = '{{ customer.name }}';
  var phone = '{{ billing_address.phone }}'
  var total_price = "{{ total_price }}";
  var money_with_currency = "{{ total_price | money_with_currency }}";
  var money_without_currency =  "{{ total_price | money_without_currency }}";
  var order_name = "{{ name }}";
  var order_id = "{{ id }}"
  var date = "{{ 'now' | date: '%m/%d/%y' }}";

  window.open("https://testinggroundparag.appspot.com/getcheckoutdata?email="+email+"&customer="+customer+"&phone="+phone+"&money_with_currency="+money_with_currency+"&order_name="+name+"&order_id="+order_id+"&date="+date+"&money_without_currency="+money_without_currency, "_blank");
</script>