


                            function loadId(){
                                form.querySelector("input[name='client-id']").value = window.crypto.randomUUID();
                                console.log(form.querySelector("input[name='client-id']").value)
                            }
                    
                            window.onload = function() {
                              loadId();
                              createPoller();
                            };


