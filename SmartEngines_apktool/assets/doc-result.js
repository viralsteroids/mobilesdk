window.addEventListener("load", function () {
    // Carousel functionality
    let currentDocIndex = 0;
    const docs = document.querySelectorAll('.doc-section');
    const thumbnails = document.querySelectorAll('.doc-thumbnail');
    const prevBtn = document.querySelector('.carousel-prev');
    const nextBtn = document.querySelector('.carousel-next');

    function showDocument(index) {
      // Hide all documents
      docs.forEach(doc => doc.style.display = 'none');
      // Show selected document
      docs[index].style.display = 'block';
      // Update active thumbnail
      thumbnails.forEach(thumb => thumb.classList.remove('active'));
      thumbnails[index].classList.add('active');
      // Update current index
      currentDocIndex = index;
      // Update button states
      prevBtn.disabled = currentDocIndex === 0;
      nextBtn.disabled = currentDocIndex === docs.length - 1;
    }

    // Thumbnail click handler
    thumbnails.forEach((thumb, index) => {
      thumb.addEventListener('click', () => {
        showDocument(index);
      });
    });

    // Navigation buttons
    prevBtn.addEventListener('click', () => {
      if (currentDocIndex > 0) {
        showDocument(currentDocIndex - 1);
      }
    });

    nextBtn.addEventListener('click', () => {
      if (currentDocIndex < docs.length - 1) {
        showDocument(currentDocIndex + 1);
      }
    });

    // Initialize
    showDocument(0);

    // Original navigation functionality
    const polygons = document.querySelectorAll("polygon");
    const ps = document.querySelectorAll(".value[data-id]");

    // Find groups
    let d = []
    // create pairs from poly
    polygons.forEach((el) => { d.push({ id: el.attributes.parent_id.value, points: el.attributes.points.value }) })

    // find duplicates
    const dubs = d.filter((item, index) => d.some((elem, idx) => elem.points === item.points && idx !== index));

    //create group
    const groups = dubs.map((el, index) => el.id);

    function resetSelection() {
        ps.forEach((p) => p.classList.remove("p_selected"))
        polygons.forEach((p) => p.classList.remove("selected_poly"))
    }

    function resetZoom() {
      document.body.style.transform = 'scale(1)';
      document.body.style.transformOrigin = '0 0';
    }

    function resetViewportZoom() {
      const viewport = document.querySelector("meta[name=viewport]");
      const originalContent = viewport.content;

      viewport.content = "width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no";

      setTimeout(() => {
        viewport.content = originalContent.includes("user-scalable") ?
          originalContent :
          originalContent + ", user-scalable=yes";
      }, 100);
    }

    function findP(el) {
      resetViewportZoom();
      // reset selection
      resetSelection();

      const root = el.currentTarget.closest("section");
      const id = el.currentTarget.attributes.parent_id.value
      let selector = `.value[data-id="${id}"]`

      // Is field have group?
      if (groups.includes(id)) {
          const temp = groups.map((el, index) => `.value[data-id="${el}"]`);
          // select all fileds in group
          selector = temp.join(",")
      }

      // Find el with corresponding id
      let current_ps = root.querySelectorAll(selector);

      if (current_ps.length) {
          // scroll to first item
          const sectionTop = current_ps[0].offsetTop;
          window.scrollTo({
              top: sectionTop,
              behavior: "smooth",
          });

          current_ps.forEach((p) => p.classList.add("p_selected"))
      }
    }

    function findNode(event) {
      resetViewportZoom();
      const viewport = document.querySelector("meta[name=viewport]");
      viewport.setAttribute("content", "width=device-width, initial-scale=1.0, maximum-scale=3.0, user-scalable=0");
      resetSelection()
      const root = event.currentTarget.closest("section");
      const id = event.currentTarget.dataset.id;
      // Find el with corresponding id
      const selector = `polygon[parent_id="${id}"]`

      let polys = root.querySelectorAll(selector);

      if (polys.length) {
        // find parent section and its svg_container
        const sectionTop = root.querySelector(".svg_container").offsetTop
        window.scrollTo({
          top: sectionTop,
          behavior: "smooth",
        });

        polys.forEach((el) => {
          el.classList.add("selected_poly");
        });
      }
    }

    polygons.forEach((el) => {
      el.addEventListener("click", findP, false);
    });

    ps.forEach((el) => {
      el.addEventListener("click", findNode, false);
    });
});